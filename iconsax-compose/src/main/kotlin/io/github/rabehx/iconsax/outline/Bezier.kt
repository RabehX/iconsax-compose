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

val Iconsax.Outline.Bezier: ImageVector
    get() {
        if (_Bezier != null) {
            return _Bezier!!
        }
        _Bezier = ImageVector.Builder(
            name = "Outline.Bezier",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3f, 9.75f)
                curveTo(1.48f, 9.75f, 0.25f, 8.52f, 0.25f, 7f)
                curveTo(0.25f, 5.48f, 1.48f, 4.25f, 3f, 4.25f)
                curveTo(4.52f, 4.25f, 5.75f, 5.48f, 5.75f, 7f)
                curveTo(5.75f, 8.52f, 4.52f, 9.75f, 3f, 9.75f)
                close()
                moveTo(3f, 5.75f)
                curveTo(2.31f, 5.75f, 1.75f, 6.31f, 1.75f, 7f)
                curveTo(1.75f, 7.69f, 2.31f, 8.25f, 3f, 8.25f)
                curveTo(3.69f, 8.25f, 4.25f, 7.69f, 4.25f, 7f)
                curveTo(4.25f, 6.31f, 3.69f, 5.75f, 3f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21f, 9.75f)
                curveTo(19.48f, 9.75f, 18.25f, 8.52f, 18.25f, 7f)
                curveTo(18.25f, 5.48f, 19.48f, 4.25f, 21f, 4.25f)
                curveTo(22.52f, 4.25f, 23.75f, 5.48f, 23.75f, 7f)
                curveTo(23.75f, 8.52f, 22.52f, 9.75f, 21f, 9.75f)
                close()
                moveTo(21f, 5.75f)
                curveTo(20.31f, 5.75f, 19.75f, 6.31f, 19.75f, 7f)
                curveTo(19.75f, 7.69f, 20.31f, 8.25f, 21f, 8.25f)
                curveTo(21.69f, 8.25f, 22.25f, 7.69f, 22.25f, 7f)
                curveTo(22.25f, 6.31f, 21.69f, 5.75f, 21f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 7.75f)
                horizontalLineTo(15f)
                curveTo(14.59f, 7.75f, 14.25f, 7.41f, 14.25f, 7f)
                curveTo(14.25f, 6.59f, 14.59f, 6.25f, 15f, 6.25f)
                horizontalLineTo(19f)
                curveTo(19.41f, 6.25f, 19.75f, 6.59f, 19.75f, 7f)
                curveTo(19.75f, 7.41f, 19.41f, 7.75f, 19f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9f, 7.75f)
                horizontalLineTo(5f)
                curveTo(4.59f, 7.75f, 4.25f, 7.41f, 4.25f, 7f)
                curveTo(4.25f, 6.59f, 4.59f, 6.25f, 5f, 6.25f)
                horizontalLineTo(9f)
                curveTo(9.41f, 6.25f, 9.75f, 6.59f, 9.75f, 7f)
                curveTo(9.75f, 7.41f, 9.41f, 7.75f, 9f, 7.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 20.75f)
                horizontalLineTo(4f)
                curveTo(2.76f, 20.75f, 1.75f, 19.74f, 1.75f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(1.75f, 15.26f, 2.76f, 14.25f, 4f, 14.25f)
                horizontalLineTo(6f)
                curveTo(7.24f, 14.25f, 8.25f, 15.26f, 8.25f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(8.25f, 19.4f, 7.72f, 20.2f, 6.9f, 20.55f)
                curveTo(6.63f, 20.68f, 6.32f, 20.75f, 6f, 20.75f)
                close()
                moveTo(4f, 15.75f)
                curveTo(3.59f, 15.75f, 3.25f, 16.09f, 3.25f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(3.25f, 18.91f, 3.59f, 19.25f, 4f, 19.25f)
                horizontalLineTo(6f)
                curveTo(6.1f, 19.25f, 6.19f, 19.23f, 6.29f, 19.18f)
                curveTo(6.58f, 19.06f, 6.75f, 18.79f, 6.75f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(6.75f, 16.09f, 6.41f, 15.75f, 6f, 15.75f)
                horizontalLineTo(4f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 20.75f)
                horizontalLineTo(18f)
                curveTo(17.68f, 20.75f, 17.37f, 20.68f, 17.07f, 20.54f)
                curveTo(16.28f, 20.21f, 15.75f, 19.4f, 15.75f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(15.75f, 15.26f, 16.76f, 14.25f, 18f, 14.25f)
                horizontalLineTo(20f)
                curveTo(21.24f, 14.25f, 22.25f, 15.26f, 22.25f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(22.25f, 19.74f, 21.24f, 20.75f, 20f, 20.75f)
                close()
                moveTo(18f, 15.75f)
                curveTo(17.59f, 15.75f, 17.25f, 16.09f, 17.25f, 16.5f)
                verticalLineTo(18.5f)
                curveTo(17.25f, 18.79f, 17.42f, 19.06f, 17.68f, 19.17f)
                curveTo(17.81f, 19.23f, 17.9f, 19.25f, 18f, 19.25f)
                horizontalLineTo(20f)
                curveTo(20.41f, 19.25f, 20.75f, 18.91f, 20.75f, 18.5f)
                verticalLineTo(16.5f)
                curveTo(20.75f, 16.09f, 20.41f, 15.75f, 20f, 15.75f)
                horizontalLineTo(18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 10.75f)
                horizontalLineTo(10.5f)
                curveTo(9.26f, 10.75f, 8.25f, 9.74f, 8.25f, 8.5f)
                verticalLineTo(5.5f)
                curveTo(8.25f, 4.26f, 9.26f, 3.25f, 10.5f, 3.25f)
                horizontalLineTo(13.5f)
                curveTo(14.74f, 3.25f, 15.75f, 4.26f, 15.75f, 5.5f)
                verticalLineTo(8.5f)
                curveTo(15.75f, 9.74f, 14.74f, 10.75f, 13.5f, 10.75f)
                close()
                moveTo(10.5f, 4.75f)
                curveTo(10.09f, 4.75f, 9.75f, 5.09f, 9.75f, 5.5f)
                verticalLineTo(8.5f)
                curveTo(9.75f, 8.91f, 10.09f, 9.25f, 10.5f, 9.25f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 9.25f, 14.25f, 8.91f, 14.25f, 8.5f)
                verticalLineTo(5.5f)
                curveTo(14.25f, 5.09f, 13.91f, 4.75f, 13.5f, 4.75f)
                horizontalLineTo(10.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.971f, 15.75f)
                curveTo(18.941f, 15.75f, 18.911f, 15.75f, 18.881f, 15.75f)
                curveTo(18.471f, 15.7f, 18.171f, 15.33f, 18.221f, 14.92f)
                curveTo(18.241f, 14.78f, 18.241f, 14.65f, 18.241f, 14.51f)
                curveTo(18.241f, 11.91f, 16.831f, 9.51f, 14.651f, 8.41f)
                curveTo(14.281f, 8.22f, 14.131f, 7.77f, 14.321f, 7.4f)
                curveTo(14.511f, 7.03f, 14.961f, 6.88f, 15.331f, 7.07f)
                curveTo(18.011f, 8.43f, 19.741f, 11.35f, 19.741f, 14.51f)
                curveTo(19.741f, 14.71f, 19.731f, 14.9f, 19.701f, 15.1f)
                curveTo(19.671f, 15.47f, 19.351f, 15.75f, 18.971f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.03f, 15.75f)
                curveTo(4.65f, 15.75f, 4.33f, 15.47f, 4.29f, 15.09f)
                curveTo(4.27f, 14.89f, 4.25f, 14.7f, 4.25f, 14.5f)
                curveTo(4.25f, 11.34f, 5.98f, 8.42f, 8.66f, 7.06f)
                curveTo(9.03f, 6.87f, 9.48f, 7.02f, 9.67f, 7.39f)
                curveTo(9.86f, 7.76f, 9.71f, 8.21f, 9.34f, 8.4f)
                curveTo(7.16f, 9.5f, 5.75f, 11.9f, 5.75f, 14.5f)
                curveTo(5.75f, 14.64f, 5.76f, 14.77f, 5.77f, 14.91f)
                curveTo(5.82f, 15.32f, 5.52f, 15.69f, 5.11f, 15.74f)
                curveTo(5.09f, 15.75f, 5.06f, 15.75f, 5.03f, 15.75f)
                close()
            }
        }.build()

        return _Bezier!!
    }

@Suppress("ObjectPropertyName")
private var _Bezier: ImageVector? = null
