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

val Iconsax.Outline.Simcard2: ImageVector
    get() {
        if (_Simcard2 != null) {
            return _Simcard2!!
        }
        _Simcard2 = ImageVector.Builder(
            name = "Outline.Simcard2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.11f, 22.72f)
                horizontalLineTo(5.89f)
                curveTo(3.16f, 22.72f, 1.25f, 20.81f, 1.25f, 18.08f)
                verticalLineTo(10.31f)
                curveTo(1.25f, 7.58f, 3.16f, 5.67f, 5.89f, 5.67f)
                horizontalLineTo(9.72f)
                curveTo(10.94f, 5.67f, 12.14f, 6.17f, 13f, 7.03f)
                lineTo(15.39f, 9.41f)
                curveTo(16.26f, 10.28f, 16.75f, 11.47f, 16.75f, 12.69f)
                verticalLineTo(18.08f)
                curveTo(16.75f, 20.81f, 14.84f, 22.72f, 12.11f, 22.72f)
                close()
                moveTo(5.89f, 7.17f)
                curveTo(3.98f, 7.17f, 2.75f, 8.4f, 2.75f, 10.31f)
                verticalLineTo(18.08f)
                curveTo(2.75f, 19.99f, 3.98f, 21.22f, 5.89f, 21.22f)
                horizontalLineTo(12.11f)
                curveTo(14.02f, 21.22f, 15.25f, 19.99f, 15.25f, 18.08f)
                verticalLineTo(12.69f)
                curveTo(15.25f, 11.86f, 14.91f, 11.06f, 14.33f, 10.47f)
                lineTo(11.94f, 8.09f)
                curveTo(11.35f, 7.5f, 10.54f, 7.17f, 9.72f, 7.17f)
                horizontalLineTo(5.89f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.11f, 18.28f)
                horizontalLineTo(16f)
                curveTo(15.59f, 18.28f, 15.25f, 17.94f, 15.25f, 17.53f)
                verticalLineTo(12.69f)
                curveTo(15.25f, 11.86f, 14.91f, 11.06f, 14.33f, 10.47f)
                lineTo(11.94f, 8.09f)
                curveTo(11.35f, 7.5f, 10.54f, 7.17f, 9.72f, 7.17f)
                horizontalLineTo(8f)
                curveTo(7.59f, 7.17f, 7.25f, 6.83f, 7.25f, 6.42f)
                verticalLineTo(5.86f)
                curveTo(7.25f, 3.13f, 9.16f, 1.22f, 11.89f, 1.22f)
                horizontalLineTo(15.72f)
                curveTo(16.94f, 1.22f, 18.14f, 1.72f, 19f, 2.58f)
                lineTo(21.39f, 4.97f)
                curveTo(22.27f, 5.85f, 22.75f, 7.01f, 22.75f, 8.25f)
                verticalLineTo(13.64f)
                curveTo(22.75f, 16.37f, 20.84f, 18.28f, 18.11f, 18.28f)
                close()
                moveTo(16.75f, 16.78f)
                horizontalLineTo(18.11f)
                curveTo(20.02f, 16.78f, 21.25f, 15.55f, 21.25f, 13.64f)
                verticalLineTo(8.25f)
                curveTo(21.25f, 7.41f, 20.92f, 6.62f, 20.33f, 6.03f)
                lineTo(17.94f, 3.64f)
                curveTo(17.36f, 3.06f, 16.55f, 2.72f, 15.72f, 2.72f)
                horizontalLineTo(11.89f)
                curveTo(10.05f, 2.72f, 8.83f, 3.87f, 8.75f, 5.67f)
                horizontalLineTo(9.72f)
                curveTo(10.94f, 5.67f, 12.14f, 6.17f, 13f, 7.03f)
                lineTo(15.39f, 9.41f)
                curveTo(16.26f, 10.28f, 16.75f, 11.47f, 16.75f, 12.69f)
                verticalLineTo(16.78f)
                close()
            }
        }.build()

        return _Simcard2!!
    }

@Suppress("ObjectPropertyName")
private var _Simcard2: ImageVector? = null
