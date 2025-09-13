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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.HomeTrendUp: ImageVector
    get() {
        if (_HomeTrendUp != null) {
            return _HomeTrendUp!!
        }
        _HomeTrendUp = ImageVector.Builder(
            name = "Outline.HomeTrendUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.79f, 22.74f)
                horizontalLineTo(6.21f)
                curveTo(3.47f, 22.74f, 1.25f, 20.51f, 1.25f, 17.77f)
                verticalLineTo(10.36f)
                curveTo(1.25f, 9f, 2.09f, 7.29f, 3.17f, 6.45f)
                lineTo(8.56f, 2.25f)
                curveTo(10.18f, 0.99f, 12.77f, 0.93f, 14.45f, 2.11f)
                lineTo(20.63f, 6.44f)
                curveTo(21.82f, 7.27f, 22.75f, 9.05f, 22.75f, 10.5f)
                verticalLineTo(17.78f)
                curveTo(22.75f, 20.51f, 20.53f, 22.74f, 17.79f, 22.74f)
                close()
                moveTo(9.48f, 3.43f)
                lineTo(4.09f, 7.63f)
                curveTo(3.38f, 8.19f, 2.75f, 9.46f, 2.75f, 10.36f)
                verticalLineTo(17.77f)
                curveTo(2.75f, 19.68f, 4.3f, 21.24f, 6.21f, 21.24f)
                horizontalLineTo(17.79f)
                curveTo(19.7f, 21.24f, 21.25f, 19.69f, 21.25f, 17.78f)
                verticalLineTo(10.5f)
                curveTo(21.25f, 9.54f, 20.56f, 8.21f, 19.77f, 7.67f)
                lineTo(13.59f, 3.34f)
                curveTo(12.45f, 2.54f, 10.57f, 2.58f, 9.48f, 3.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.5f, 17.25f)
                curveTo(7.31f, 17.25f, 7.12f, 17.18f, 6.97f, 17.03f)
                curveTo(6.68f, 16.74f, 6.68f, 16.26f, 6.97f, 15.97f)
                lineTo(10.17f, 12.77f)
                curveTo(10.33f, 12.61f, 10.54f, 12.53f, 10.77f, 12.55f)
                curveTo(10.99f, 12.57f, 11.19f, 12.69f, 11.32f, 12.88f)
                lineTo(12.41f, 14.52f)
                lineTo(15.96f, 10.97f)
                curveTo(16.25f, 10.68f, 16.73f, 10.68f, 17.02f, 10.97f)
                curveTo(17.31f, 11.26f, 17.31f, 11.74f, 17.02f, 12.03f)
                lineTo(12.82f, 16.23f)
                curveTo(12.66f, 16.39f, 12.45f, 16.47f, 12.22f, 16.45f)
                curveTo(12f, 16.43f, 11.8f, 16.31f, 11.67f, 16.12f)
                lineTo(10.58f, 14.48f)
                lineTo(8.03f, 17.03f)
                curveTo(7.88f, 17.18f, 7.69f, 17.25f, 7.5f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.5f, 14.25f)
                curveTo(16.09f, 14.25f, 15.75f, 13.91f, 15.75f, 13.5f)
                verticalLineTo(12.25f)
                horizontalLineTo(14.5f)
                curveTo(14.09f, 12.25f, 13.75f, 11.91f, 13.75f, 11.5f)
                curveTo(13.75f, 11.09f, 14.09f, 10.75f, 14.5f, 10.75f)
                horizontalLineTo(16.5f)
                curveTo(16.91f, 10.75f, 17.25f, 11.09f, 17.25f, 11.5f)
                verticalLineTo(13.5f)
                curveTo(17.25f, 13.91f, 16.91f, 14.25f, 16.5f, 14.25f)
                close()
            }
        }.build()

        return _HomeTrendUp!!
    }

@Suppress("ObjectPropertyName")
private var _HomeTrendUp: ImageVector? = null
