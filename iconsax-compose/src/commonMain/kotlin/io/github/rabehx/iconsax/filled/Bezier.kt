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


val Iconsax.Filled.Bezier: ImageVector
    get() {
        if (_Bezier != null) {
            return _Bezier!!
        }
        _Bezier = ImageVector.Builder(
            name = "Filled.Bezier",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.14f, 7.72f)
                curveTo(19.43f, 8.47f, 20.15f, 9f, 21f, 9f)
                curveTo(22.1f, 9f, 23f, 8.1f, 23f, 7f)
                curveTo(23f, 5.9f, 22.1f, 5f, 21f, 5f)
                curveTo(20.15f, 5f, 19.43f, 5.53f, 19.14f, 6.28f)
                curveTo(19.09f, 6.27f, 19.05f, 6.25f, 19f, 6.25f)
                horizontalLineTo(15f)
                verticalLineTo(5.5f)
                curveTo(15f, 4.68f, 14.32f, 4f, 13.5f, 4f)
                horizontalLineTo(10.5f)
                curveTo(9.68f, 4f, 9f, 4.68f, 9f, 5.5f)
                verticalLineTo(6.25f)
                horizontalLineTo(5f)
                curveTo(4.95f, 6.25f, 4.91f, 6.27f, 4.86f, 6.28f)
                curveTo(4.57f, 5.53f, 3.85f, 5f, 3f, 5f)
                curveTo(1.9f, 5f, 1f, 5.9f, 1f, 7f)
                curveTo(1f, 8.1f, 1.9f, 9f, 3f, 9f)
                curveTo(3.85f, 9f, 4.57f, 8.47f, 4.86f, 7.72f)
                curveTo(4.91f, 7.73f, 4.95f, 7.75f, 5f, 7.75f)
                horizontalLineTo(7.57f)
                curveTo(5.52f, 9.27f, 4.25f, 11.79f, 4.25f, 14.5f)
                curveTo(4.25f, 14.67f, 4.26f, 14.83f, 4.28f, 15f)
                horizontalLineTo(4f)
                curveTo(3.17f, 15f, 2.5f, 15.67f, 2.5f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(2.5f, 19.33f, 3.17f, 20f, 4f, 20f)
                horizontalLineTo(6f)
                curveTo(6.22f, 20f, 6.42f, 19.95f, 6.61f, 19.86f)
                curveTo(7.13f, 19.64f, 7.5f, 19.11f, 7.5f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(7.5f, 15.67f, 6.83f, 15f, 6f, 15f)
                horizontalLineTo(5.77f)
                curveTo(5.77f, 14.97f, 5.78f, 14.94f, 5.78f, 14.91f)
                curveTo(5.76f, 14.77f, 5.76f, 14.64f, 5.76f, 14.5f)
                curveTo(5.76f, 12.03f, 7.03f, 9.77f, 9.02f, 8.6f)
                curveTo(9.06f, 9.37f, 9.71f, 10f, 10.5f, 10f)
                horizontalLineTo(13.5f)
                curveTo(14.29f, 10f, 14.94f, 9.37f, 14.99f, 8.6f)
                curveTo(16.98f, 9.77f, 18.25f, 12.04f, 18.25f, 14.5f)
                curveTo(18.25f, 14.64f, 18.24f, 14.77f, 18.23f, 14.91f)
                curveTo(18.23f, 14.94f, 18.24f, 14.97f, 18.24f, 15f)
                horizontalLineTo(18f)
                curveTo(17.17f, 15f, 16.5f, 15.67f, 16.5f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(16.5f, 19.11f, 16.87f, 19.64f, 17.39f, 19.86f)
                curveTo(17.58f, 19.95f, 17.78f, 20f, 18f, 20f)
                horizontalLineTo(20f)
                curveTo(20.83f, 20f, 21.5f, 19.33f, 21.5f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(21.5f, 15.67f, 20.83f, 15f, 20f, 15f)
                horizontalLineTo(19.72f)
                curveTo(19.74f, 14.83f, 19.75f, 14.67f, 19.75f, 14.5f)
                curveTo(19.75f, 11.79f, 18.48f, 9.27f, 16.43f, 7.75f)
                horizontalLineTo(19f)
                curveTo(19.05f, 7.75f, 19.09f, 7.73f, 19.14f, 7.72f)
                close()
            }
        }.build()

        return _Bezier!!
    }

@Suppress("ObjectPropertyName")
private var _Bezier: ImageVector? = null
