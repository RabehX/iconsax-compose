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

val Iconsax.Outline.Shapes1: ImageVector
    get() {
        if (_Shapes1 != null) {
            return _Shapes1!!
        }
        _Shapes1 = ImageVector.Builder(
            name = "Outline.Shapes1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.721f, 22.75f)
                horizontalLineTo(7.221f)
                curveTo(3.071f, 22.75f, 1.221f, 20.9f, 1.221f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(1.221f, 8.1f, 3.071f, 6.25f, 7.221f, 6.25f)
                horizontalLineTo(11.721f)
                curveTo(15.871f, 6.25f, 17.721f, 8.1f, 17.721f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(17.721f, 20.9f, 15.871f, 22.75f, 11.721f, 22.75f)
                close()
                moveTo(7.221f, 7.75f)
                curveTo(3.901f, 7.75f, 2.721f, 8.93f, 2.721f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(2.721f, 20.07f, 3.901f, 21.25f, 7.221f, 21.25f)
                horizontalLineTo(11.721f)
                curveTo(15.041f, 21.25f, 16.221f, 20.07f, 16.221f, 16.75f)
                verticalLineTo(12.25f)
                curveTo(16.221f, 8.93f, 15.041f, 7.75f, 11.721f, 7.75f)
                horizontalLineTo(7.221f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.969f, 13.72f)
                curveTo(16.779f, 13.72f, 16.599f, 13.65f, 16.459f, 13.52f)
                curveTo(16.299f, 13.38f, 16.219f, 13.18f, 16.219f, 12.97f)
                verticalLineTo(12.25f)
                curveTo(16.219f, 8.93f, 15.039f, 7.75f, 11.719f, 7.75f)
                horizontalLineTo(10.999f)
                curveTo(10.789f, 7.75f, 10.589f, 7.66f, 10.449f, 7.51f)
                curveTo(10.309f, 7.35f, 10.239f, 7.15f, 10.259f, 6.94f)
                curveTo(10.549f, 3.7f, 13.219f, 1.26f, 16.479f, 1.26f)
                curveTo(19.599f, 1.26f, 22.259f, 3.59f, 22.659f, 6.68f)
                curveTo(22.699f, 6.92f, 22.729f, 7.21f, 22.729f, 7.51f)
                curveTo(22.729f, 10.77f, 20.289f, 13.44f, 17.049f, 13.73f)
                curveTo(17.019f, 13.72f, 16.999f, 13.72f, 16.969f, 13.72f)
                close()
                moveTo(11.889f, 6.25f)
                curveTo(15.859f, 6.3f, 17.669f, 8.1f, 17.719f, 12.08f)
                curveTo(19.759f, 11.54f, 21.219f, 9.69f, 21.219f, 7.5f)
                curveTo(21.219f, 7.29f, 21.199f, 7.09f, 21.169f, 6.9f)
                curveTo(20.859f, 4.52f, 18.839f, 2.75f, 16.469f, 2.75f)
                curveTo(14.279f, 2.75f, 12.439f, 4.21f, 11.889f, 6.25f)
                close()
            }
        }.build()

        return _Shapes1!!
    }

@Suppress("ObjectPropertyName")
private var _Shapes1: ImageVector? = null
