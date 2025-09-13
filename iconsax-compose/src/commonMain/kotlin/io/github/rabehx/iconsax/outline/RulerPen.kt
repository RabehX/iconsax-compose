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

val Iconsax.Outline.RulerPen: ImageVector
    get() {
        if (_RulerPen != null) {
            return _RulerPen!!
        }
        _RulerPen = ImageVector.Builder(
            name = "Outline.RulerPen",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.471f, 22.75f)
                horizontalLineTo(14.471f)
                curveTo(12.051f, 22.75f, 10.721f, 21.42f, 10.721f, 19f)
                verticalLineTo(5f)
                curveTo(10.721f, 2.58f, 12.051f, 1.25f, 14.471f, 1.25f)
                horizontalLineTo(18.471f)
                curveTo(20.891f, 1.25f, 22.221f, 2.58f, 22.221f, 5f)
                verticalLineTo(19f)
                curveTo(22.221f, 21.42f, 20.881f, 22.75f, 18.471f, 22.75f)
                close()
                moveTo(14.471f, 2.75f)
                curveTo(12.891f, 2.75f, 12.221f, 3.42f, 12.221f, 5f)
                verticalLineTo(19f)
                curveTo(12.221f, 20.58f, 12.891f, 21.25f, 14.471f, 21.25f)
                horizontalLineTo(18.471f)
                curveTo(20.051f, 21.25f, 20.721f, 20.58f, 20.721f, 19f)
                verticalLineTo(5f)
                curveTo(20.721f, 3.42f, 20.051f, 2.75f, 18.471f, 2.75f)
                horizontalLineTo(14.471f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.471f, 6.75f)
                horizontalLineTo(11.471f)
                curveTo(11.061f, 6.75f, 10.721f, 6.41f, 10.721f, 6f)
                curveTo(10.721f, 5.59f, 11.061f, 5.25f, 11.471f, 5.25f)
                horizontalLineTo(16.471f)
                curveTo(16.881f, 5.25f, 17.221f, 5.59f, 17.221f, 6f)
                curveTo(17.221f, 6.41f, 16.881f, 6.75f, 16.471f, 6.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.471f, 18.75f)
                horizontalLineTo(11.471f)
                curveTo(11.061f, 18.75f, 10.721f, 18.41f, 10.721f, 18f)
                curveTo(10.721f, 17.59f, 11.061f, 17.25f, 11.471f, 17.25f)
                horizontalLineTo(15.471f)
                curveTo(15.881f, 17.25f, 16.221f, 17.59f, 16.221f, 18f)
                curveTo(16.221f, 18.41f, 15.881f, 18.75f, 15.471f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.471f, 14.75f)
                curveTo(16.461f, 14.75f, 16.461f, 14.75f, 16.471f, 14.75f)
                lineTo(11.461f, 14.7f)
                curveTo(11.051f, 14.7f, 10.711f, 14.36f, 10.721f, 13.94f)
                curveTo(10.721f, 13.53f, 11.061f, 13.2f, 11.471f, 13.2f)
                curveTo(11.471f, 13.2f, 11.471f, 13.2f, 11.481f, 13.2f)
                lineTo(16.481f, 13.25f)
                curveTo(16.891f, 13.25f, 17.231f, 13.59f, 17.221f, 14.01f)
                curveTo(17.211f, 14.42f, 16.881f, 14.75f, 16.471f, 14.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.471f, 10.75f)
                horizontalLineTo(11.471f)
                curveTo(11.061f, 10.75f, 10.721f, 10.41f, 10.721f, 10f)
                curveTo(10.721f, 9.59f, 11.061f, 9.25f, 11.471f, 9.25f)
                horizontalLineTo(14.471f)
                curveTo(14.881f, 9.25f, 15.221f, 9.59f, 15.221f, 10f)
                curveTo(15.221f, 10.41f, 14.881f, 10.75f, 14.471f, 10.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.489f, 22.72f)
                curveTo(4.579f, 22.72f, 3.719f, 22.16f, 3.129f, 21.18f)
                lineTo(2.309f, 19.82f)
                curveTo(2.009f, 19.32f, 1.779f, 18.5f, 1.779f, 17.92f)
                verticalLineTo(4.95f)
                curveTo(1.779f, 2.91f, 3.439f, 1.25f, 5.479f, 1.25f)
                curveTo(7.519f, 1.25f, 9.179f, 2.91f, 9.179f, 4.95f)
                verticalLineTo(17.91f)
                curveTo(9.179f, 18.49f, 8.949f, 19.31f, 8.649f, 19.81f)
                lineTo(7.829f, 21.17f)
                curveTo(7.259f, 22.16f, 6.399f, 22.72f, 5.489f, 22.72f)
                close()
                moveTo(5.489f, 2.75f)
                curveTo(4.279f, 2.75f, 3.289f, 3.74f, 3.289f, 4.95f)
                verticalLineTo(17.91f)
                curveTo(3.289f, 18.22f, 3.439f, 18.77f, 3.599f, 19.04f)
                lineTo(4.419f, 20.4f)
                curveTo(4.729f, 20.92f, 5.119f, 21.21f, 5.489f, 21.21f)
                curveTo(5.859f, 21.21f, 6.249f, 20.91f, 6.559f, 20.4f)
                lineTo(7.379f, 19.04f)
                curveTo(7.539f, 18.77f, 7.689f, 18.22f, 7.689f, 17.91f)
                verticalLineTo(4.95f)
                curveTo(7.689f, 3.74f, 6.699f, 2.75f, 5.489f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.439f, 7.75f)
                horizontalLineTo(2.529f)
                curveTo(2.119f, 7.75f, 1.779f, 7.41f, 1.779f, 7f)
                curveTo(1.779f, 6.59f, 2.119f, 6.25f, 2.529f, 6.25f)
                horizontalLineTo(8.439f)
                curveTo(8.849f, 6.25f, 9.189f, 6.59f, 9.189f, 7f)
                curveTo(9.189f, 7.41f, 8.849f, 7.75f, 8.439f, 7.75f)
                close()
            }
        }.build()

        return _RulerPen!!
    }

@Suppress("ObjectPropertyName")
private var _RulerPen: ImageVector? = null
