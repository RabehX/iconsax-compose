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

val Iconsax.Outline.ChartSquare: ImageVector
    get() {
        if (_ChartSquare != null) {
            return _ChartSquare!!
        }
        _ChartSquare = ImageVector.Builder(
            name = "Outline.ChartSquare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.11f, 18.15f)
                horizontalLineTo(6.32f)
                curveTo(5.91f, 18.15f, 5.57f, 17.81f, 5.57f, 17.4f)
                verticalLineTo(12.28f)
                curveTo(5.57f, 11.24f, 6.42f, 10.39f, 7.46f, 10.39f)
                horizontalLineTo(10.11f)
                curveTo(10.52f, 10.39f, 10.86f, 10.73f, 10.86f, 11.14f)
                verticalLineTo(17.39f)
                curveTo(10.86f, 17.81f, 10.52f, 18.15f, 10.11f, 18.15f)
                close()
                moveTo(7.07f, 16.65f)
                horizontalLineTo(9.36f)
                verticalLineTo(11.9f)
                horizontalLineTo(7.46f)
                curveTo(7.25f, 11.9f, 7.07f, 12.07f, 7.07f, 12.29f)
                verticalLineTo(16.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.89f, 18.15f)
                horizontalLineTo(10.1f)
                curveTo(9.69f, 18.15f, 9.35f, 17.81f, 9.35f, 17.4f)
                verticalLineTo(7.74f)
                curveTo(9.35f, 6.7f, 10.2f, 5.85f, 11.24f, 5.85f)
                horizontalLineTo(12.76f)
                curveTo(13.8f, 5.85f, 14.65f, 6.7f, 14.65f, 7.74f)
                verticalLineTo(17.4f)
                curveTo(14.64f, 17.81f, 14.31f, 18.15f, 13.89f, 18.15f)
                close()
                moveTo(10.86f, 16.65f)
                horizontalLineTo(13.15f)
                verticalLineTo(7.74f)
                curveTo(13.15f, 7.53f, 12.98f, 7.35f, 12.76f, 7.35f)
                horizontalLineTo(11.24f)
                curveTo(11.03f, 7.35f, 10.85f, 7.52f, 10.85f, 7.74f)
                verticalLineTo(16.65f)
                horizontalLineTo(10.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.681f, 18.15f)
                horizontalLineTo(13.891f)
                curveTo(13.481f, 18.15f, 13.141f, 17.81f, 13.141f, 17.4f)
                verticalLineTo(12.85f)
                curveTo(13.141f, 12.44f, 13.481f, 12.1f, 13.891f, 12.1f)
                horizontalLineTo(16.541f)
                curveTo(17.581f, 12.1f, 18.431f, 12.95f, 18.431f, 13.99f)
                verticalLineTo(17.4f)
                curveTo(18.431f, 17.81f, 18.101f, 18.15f, 17.681f, 18.15f)
                close()
                moveTo(14.641f, 16.65f)
                horizontalLineTo(16.931f)
                verticalLineTo(13.99f)
                curveTo(16.931f, 13.78f, 16.761f, 13.6f, 16.541f, 13.6f)
                horizontalLineTo(14.641f)
                verticalLineTo(16.65f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22.75f)
                horizontalLineTo(9f)
                curveTo(3.57f, 22.75f, 1.25f, 20.43f, 1.25f, 15f)
                verticalLineTo(9f)
                curveTo(1.25f, 3.57f, 3.57f, 1.25f, 9f, 1.25f)
                horizontalLineTo(15f)
                curveTo(20.43f, 1.25f, 22.75f, 3.57f, 22.75f, 9f)
                verticalLineTo(15f)
                curveTo(22.75f, 20.43f, 20.43f, 22.75f, 15f, 22.75f)
                close()
                moveTo(9f, 2.75f)
                curveTo(4.39f, 2.75f, 2.75f, 4.39f, 2.75f, 9f)
                verticalLineTo(15f)
                curveTo(2.75f, 19.61f, 4.39f, 21.25f, 9f, 21.25f)
                horizontalLineTo(15f)
                curveTo(19.61f, 21.25f, 21.25f, 19.61f, 21.25f, 15f)
                verticalLineTo(9f)
                curveTo(21.25f, 4.39f, 19.61f, 2.75f, 15f, 2.75f)
                horizontalLineTo(9f)
                close()
            }
        }.build()

        return _ChartSquare!!
    }

@Suppress("ObjectPropertyName")
private var _ChartSquare: ImageVector? = null
