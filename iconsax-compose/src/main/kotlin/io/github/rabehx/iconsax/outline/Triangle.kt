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

val Iconsax.Outline.Triangle: ImageVector
    get() {
        if (_Triangle != null) {
            return _Triangle!!
        }
        _Triangle = ImageVector.Builder(
            name = "Outline.Triangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.06f, 22.16f)
                horizontalLineTo(5.94f)
                curveTo(3.99f, 22.16f, 2.5f, 21.45f, 1.74f, 20.17f)
                curveTo(0.99f, 18.89f, 1.09f, 17.24f, 2.04f, 15.54f)
                lineTo(8.1f, 4.63f)
                curveTo(9.1f, 2.83f, 10.481f, 1.84f, 12f, 1.84f)
                curveTo(13.521f, 1.84f, 14.901f, 2.83f, 15.901f, 4.63f)
                lineTo(21.961f, 15.54f)
                curveTo(22.91f, 17.25f, 23.021f, 18.89f, 22.26f, 20.17f)
                curveTo(21.5f, 21.45f, 20.01f, 22.16f, 18.06f, 22.16f)
                close()
                moveTo(12f, 3.34f)
                curveTo(11.061f, 3.34f, 10.141f, 4.06f, 9.41f, 5.36f)
                lineTo(3.36f, 16.27f)
                curveTo(2.68f, 17.49f, 2.57f, 18.61f, 3.04f, 19.42f)
                curveTo(3.51f, 20.22f, 4.55f, 20.67f, 5.95f, 20.67f)
                horizontalLineTo(18.07f)
                curveTo(19.471f, 20.67f, 20.5f, 20.23f, 20.98f, 19.42f)
                curveTo(21.451f, 18.61f, 21.34f, 17.5f, 20.66f, 16.27f)
                lineTo(14.59f, 5.36f)
                curveTo(13.861f, 4.06f, 12.941f, 3.34f, 12f, 3.34f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.441f, 20.75f)
                curveTo(21.291f, 20.75f, 21.141f, 20.71f, 21.011f, 20.61f)
                lineTo(12.001f, 14.3f)
                lineTo(2.991f, 20.61f)
                curveTo(2.651f, 20.85f, 2.181f, 20.77f, 1.951f, 20.43f)
                curveTo(1.711f, 20.09f, 1.791f, 19.62f, 2.131f, 19.39f)
                lineTo(11.571f, 12.78f)
                curveTo(11.831f, 12.6f, 12.171f, 12.6f, 12.431f, 12.78f)
                lineTo(21.871f, 19.39f)
                curveTo(22.211f, 19.63f, 22.291f, 20.1f, 22.051f, 20.43f)
                curveTo(21.911f, 20.64f, 21.681f, 20.75f, 21.441f, 20.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.14f)
                curveTo(11.59f, 14.14f, 11.25f, 13.8f, 11.25f, 13.39f)
                verticalLineTo(3f)
                curveTo(11.25f, 2.59f, 11.59f, 2.25f, 12f, 2.25f)
                curveTo(12.41f, 2.25f, 12.75f, 2.59f, 12.75f, 3f)
                verticalLineTo(13.39f)
                curveTo(12.75f, 13.8f, 12.41f, 14.14f, 12f, 14.14f)
                close()
            }
        }.build()

        return _Triangle!!
    }

@Suppress("ObjectPropertyName")
private var _Triangle: ImageVector? = null
