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

val Iconsax.Outline.Paperclip2: ImageVector
    get() {
        if (_Paperclip2 != null) {
            return _Paperclip2!!
        }
        _Paperclip2 = ImageVector.Builder(
            name = "Outline.Paperclip2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.329f, 21.34f)
                curveTo(11.239f, 21.34f, 10.149f, 20.93f, 9.319f, 20.1f)
                curveTo(7.659f, 18.44f, 7.659f, 15.75f, 9.319f, 14.09f)
                lineTo(11.799f, 11.62f)
                curveTo(12.089f, 11.33f, 12.569f, 11.33f, 12.859f, 11.62f)
                curveTo(13.149f, 11.91f, 13.149f, 12.39f, 12.859f, 12.68f)
                lineTo(10.379f, 15.15f)
                curveTo(9.309f, 16.22f, 9.309f, 17.97f, 10.379f, 19.04f)
                curveTo(11.449f, 20.11f, 13.199f, 20.11f, 14.269f, 19.04f)
                lineTo(18.159f, 15.15f)
                curveTo(19.339f, 13.97f, 19.989f, 12.4f, 19.989f, 10.73f)
                curveTo(19.989f, 9.06f, 19.339f, 7.49f, 18.159f, 6.31f)
                curveTo(15.719f, 3.87f, 11.759f, 3.87f, 9.319f, 6.31f)
                lineTo(5.079f, 10.55f)
                curveTo(4.089f, 11.54f, 3.539f, 12.86f, 3.539f, 14.26f)
                curveTo(3.539f, 15.66f, 4.089f, 16.98f, 5.079f, 17.97f)
                curveTo(5.369f, 18.26f, 5.369f, 18.74f, 5.079f, 19.03f)
                curveTo(4.789f, 19.32f, 4.309f, 19.32f, 4.019f, 19.03f)
                curveTo(2.749f, 17.75f, 2.039f, 16.06f, 2.039f, 14.26f)
                curveTo(2.039f, 12.46f, 2.739f, 10.76f, 4.019f, 9.49f)
                lineTo(8.259f, 5.25f)
                curveTo(11.279f, 2.23f, 16.199f, 2.23f, 19.219f, 5.25f)
                curveTo(20.679f, 6.71f, 21.489f, 8.66f, 21.489f, 10.73f)
                curveTo(21.489f, 12.8f, 20.679f, 14.75f, 19.219f, 16.21f)
                lineTo(15.329f, 20.1f)
                curveTo(14.499f, 20.93f, 13.419f, 21.34f, 12.329f, 21.34f)
                close()
            }
        }.build()

        return _Paperclip2!!
    }

@Suppress("ObjectPropertyName")
private var _Paperclip2: ImageVector? = null
