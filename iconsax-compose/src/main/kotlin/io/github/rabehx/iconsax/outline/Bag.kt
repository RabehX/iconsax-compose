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

val Iconsax.Outline.Bag: ImageVector
    get() {
        if (_Bag != null) {
            return _Bag!!
        }
        _Bag = ImageVector.Builder(
            name = "Outline.Bag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.191f, 6.38f)
                curveTo(5.001f, 6.38f, 4.801f, 6.3f, 4.661f, 6.16f)
                curveTo(4.371f, 5.87f, 4.371f, 5.39f, 4.661f, 5.1f)
                lineTo(8.291f, 1.47f)
                curveTo(8.581f, 1.18f, 9.061f, 1.18f, 9.351f, 1.47f)
                curveTo(9.641f, 1.76f, 9.641f, 2.24f, 9.351f, 2.53f)
                lineTo(5.721f, 6.16f)
                curveTo(5.571f, 6.3f, 5.381f, 6.38f, 5.191f, 6.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.809f, 6.38f)
                curveTo(18.619f, 6.38f, 18.429f, 6.31f, 18.279f, 6.16f)
                lineTo(14.649f, 2.53f)
                curveTo(14.359f, 2.24f, 14.359f, 1.76f, 14.649f, 1.47f)
                curveTo(14.939f, 1.18f, 15.419f, 1.18f, 15.709f, 1.47f)
                lineTo(19.339f, 5.1f)
                curveTo(19.629f, 5.39f, 19.629f, 5.87f, 19.339f, 6.16f)
                curveTo(19.199f, 6.3f, 18.999f, 6.38f, 18.809f, 6.38f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.21f, 10.6f)
                curveTo(20.14f, 10.6f, 20.07f, 10.6f, 20f, 10.6f)
                horizontalLineTo(19.77f)
                horizontalLineTo(4f)
                curveTo(3.3f, 10.61f, 2.5f, 10.61f, 1.92f, 10.03f)
                curveTo(1.46f, 9.58f, 1.25f, 8.88f, 1.25f, 7.85f)
                curveTo(1.25f, 5.1f, 3.26f, 5.1f, 4.22f, 5.1f)
                horizontalLineTo(19.78f)
                curveTo(20.74f, 5.1f, 22.75f, 5.1f, 22.75f, 7.85f)
                curveTo(22.75f, 8.89f, 22.54f, 9.58f, 22.08f, 10.03f)
                curveTo(21.56f, 10.55f, 20.86f, 10.6f, 20.21f, 10.6f)
                close()
                moveTo(4.22f, 9.1f)
                horizontalLineTo(20.01f)
                curveTo(20.46f, 9.11f, 20.88f, 9.11f, 21.02f, 8.97f)
                curveTo(21.09f, 8.9f, 21.24f, 8.66f, 21.24f, 7.85f)
                curveTo(21.24f, 6.72f, 20.96f, 6.6f, 19.77f, 6.6f)
                horizontalLineTo(4.22f)
                curveTo(3.03f, 6.6f, 2.75f, 6.72f, 2.75f, 7.85f)
                curveTo(2.75f, 8.66f, 2.91f, 8.9f, 2.97f, 8.97f)
                curveTo(3.11f, 9.1f, 3.54f, 9.1f, 3.98f, 9.1f)
                horizontalLineTo(4.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.76f, 18.3f)
                curveTo(9.35f, 18.3f, 9.01f, 17.96f, 9.01f, 17.55f)
                verticalLineTo(14f)
                curveTo(9.01f, 13.59f, 9.35f, 13.25f, 9.76f, 13.25f)
                curveTo(10.17f, 13.25f, 10.51f, 13.59f, 10.51f, 14f)
                verticalLineTo(17.55f)
                curveTo(10.51f, 17.97f, 10.17f, 18.3f, 9.76f, 18.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.359f, 18.3f)
                curveTo(13.949f, 18.3f, 13.609f, 17.96f, 13.609f, 17.55f)
                verticalLineTo(14f)
                curveTo(13.609f, 13.59f, 13.949f, 13.25f, 14.359f, 13.25f)
                curveTo(14.769f, 13.25f, 15.109f, 13.59f, 15.109f, 14f)
                verticalLineTo(17.55f)
                curveTo(15.109f, 17.97f, 14.769f, 18.3f, 14.359f, 18.3f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.891f, 22.75f)
                horizontalLineTo(8.861f)
                curveTo(5.281f, 22.75f, 4.481f, 20.62f, 4.171f, 18.77f)
                lineTo(2.761f, 10.12f)
                curveTo(2.691f, 9.71f, 2.971f, 9.33f, 3.381f, 9.26f)
                curveTo(3.791f, 9.19f, 4.171f, 9.47f, 4.241f, 9.88f)
                lineTo(5.651f, 18.52f)
                curveTo(5.941f, 20.29f, 6.541f, 21.25f, 8.861f, 21.25f)
                horizontalLineTo(14.891f)
                curveTo(17.461f, 21.25f, 17.751f, 20.35f, 18.081f, 18.61f)
                lineTo(19.761f, 9.86f)
                curveTo(19.841f, 9.45f, 20.231f, 9.18f, 20.641f, 9.27f)
                curveTo(21.051f, 9.35f, 21.311f, 9.74f, 21.231f, 10.15f)
                lineTo(19.551f, 18.9f)
                curveTo(19.161f, 20.93f, 18.511f, 22.75f, 14.891f, 22.75f)
                close()
            }
        }.build()

        return _Bag!!
    }

@Suppress("ObjectPropertyName")
private var _Bag: ImageVector? = null
