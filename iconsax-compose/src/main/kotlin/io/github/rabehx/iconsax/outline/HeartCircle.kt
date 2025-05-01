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

val Iconsax.Outline.HeartCircle: ImageVector
    get() {
        if (_HeartCircle != null) {
            return _HeartCircle!!
        }
        _HeartCircle = ImageVector.Builder(
            name = "Outline.HeartCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 18.25f)
                curveTo(11.789f, 18.25f, 11.589f, 18.22f, 11.419f, 18.16f)
                curveTo(9.269f, 17.43f, 5.859f, 14.81f, 5.859f, 10.91f)
                curveTo(5.859f, 8.83f, 7.539f, 7.14f, 9.609f, 7.14f)
                curveTo(10.509f, 7.14f, 11.339f, 7.45f, 12.009f, 8.01f)
                curveTo(12.679f, 7.45f, 13.519f, 7.14f, 14.399f, 7.14f)
                curveTo(16.469f, 7.14f, 18.149f, 8.83f, 18.149f, 10.91f)
                curveTo(18.149f, 14.8f, 14.739f, 17.42f, 12.579f, 18.16f)
                curveTo(12.409f, 18.22f, 12.199f, 18.25f, 11.999f, 18.25f)
                close()
                moveTo(9.599f, 8.65f)
                curveTo(8.359f, 8.65f, 7.349f, 9.67f, 7.349f, 10.92f)
                curveTo(7.349f, 14.41f, 10.719f, 16.35f, 11.899f, 16.75f)
                curveTo(11.939f, 16.76f, 12.039f, 16.76f, 12.079f, 16.75f)
                curveTo(13.259f, 16.35f, 16.629f, 14.41f, 16.629f, 10.92f)
                curveTo(16.629f, 9.67f, 15.619f, 8.65f, 14.379f, 8.65f)
                curveTo(13.679f, 8.65f, 13.009f, 8.99f, 12.589f, 9.56f)
                curveTo(12.309f, 9.94f, 11.669f, 9.94f, 11.389f, 9.56f)
                curveTo(10.969f, 8.98f, 10.319f, 8.65f, 9.599f, 8.65f)
                close()
            }
        }.build()

        return _HeartCircle!!
    }

@Suppress("ObjectPropertyName")
private var _HeartCircle: ImageVector? = null
