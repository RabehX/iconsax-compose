/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.PresentionChart: ImageVector
    get() {
        if (_PresentionChart != null) {
            return _PresentionChart!!
        }
        _PresentionChart = ImageVector.Builder(
            name = "Filled.PresentionChart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 2.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 2.75f, 1.25f, 2.41f, 1.25f, 2f)
                curveTo(1.25f, 1.59f, 1.59f, 1.25f, 2f, 1.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 1.25f, 22.75f, 1.59f, 22.75f, 2f)
                curveTo(22.75f, 2.41f, 22.41f, 2.75f, 22f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.67f, 22.34f)
                curveTo(16.54f, 22.6f, 16.27f, 22.75f, 16f, 22.75f)
                curveTo(15.89f, 22.75f, 15.77f, 22.72f, 15.67f, 22.67f)
                lineTo(12f, 20.84f)
                lineTo(8.33f, 22.67f)
                curveTo(8.23f, 22.72f, 8.11f, 22.75f, 8f, 22.75f)
                curveTo(7.73f, 22.75f, 7.46f, 22.6f, 7.33f, 22.34f)
                curveTo(7.14f, 21.96f, 7.29f, 21.51f, 7.67f, 21.33f)
                lineTo(11.25f, 19.54f)
                verticalLineTo(17f)
                horizontalLineTo(12.75f)
                verticalLineTo(19.54f)
                lineTo(16.33f, 21.33f)
                curveTo(16.71f, 21.51f, 16.86f, 21.96f, 16.67f, 22.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 2f)
                verticalLineTo(14.1f)
                curveTo(3f, 16f, 4f, 17f, 5.9f, 17f)
                horizontalLineTo(18.1f)
                curveTo(20f, 17f, 21f, 16f, 21f, 14.1f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                close()
                moveTo(16.98f, 8.58f)
                lineTo(13.83f, 11.21f)
                curveTo(13.54f, 11.45f, 13.17f, 11.55f, 12.82f, 11.49f)
                curveTo(12.46f, 11.43f, 12.15f, 11.21f, 11.96f, 10.89f)
                lineTo(10.91f, 9.14f)
                lineTo(7.98f, 11.58f)
                curveTo(7.84f, 11.7f, 7.67f, 11.75f, 7.5f, 11.75f)
                curveTo(7.29f, 11.75f, 7.07f, 11.66f, 6.92f, 11.48f)
                curveTo(6.65f, 11.16f, 6.7f, 10.69f, 7.02f, 10.42f)
                lineTo(10.17f, 7.79f)
                curveTo(10.46f, 7.55f, 10.83f, 7.45f, 11.18f, 7.51f)
                curveTo(11.54f, 7.57f, 11.85f, 7.79f, 12.04f, 8.11f)
                lineTo(13.09f, 9.86f)
                lineTo(16.02f, 7.42f)
                curveTo(16.34f, 7.15f, 16.81f, 7.2f, 17.08f, 7.52f)
                curveTo(17.34f, 7.84f, 17.3f, 8.31f, 16.98f, 8.58f)
                close()
            }
        }.build()

        return _PresentionChart!!
    }

@Suppress("ObjectPropertyName")
private var _PresentionChart: ImageVector? = null
