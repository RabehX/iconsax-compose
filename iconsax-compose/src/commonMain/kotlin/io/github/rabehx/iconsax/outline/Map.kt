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

val Iconsax.Outline.Map: ImageVector
    get() {
        if (_Map != null) {
            return _Map!!
        }
        _Map = ImageVector.Builder(
            name = "Outline.Map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.649f, 21.41f)
                curveTo(15.219f, 21.41f, 14.789f, 21.32f, 14.439f, 21.15f)
                lineTo(9.189f, 18.52f)
                curveTo(8.889f, 18.37f, 8.299f, 18.38f, 8.009f, 18.55f)
                lineTo(5.649f, 19.9f)
                curveTo(4.629f, 20.48f, 3.579f, 20.56f, 2.789f, 20.09f)
                curveTo(1.989f, 19.63f, 1.539f, 18.69f, 1.539f, 17.51f)
                verticalLineTo(7.79f)
                curveTo(1.539f, 6.88f, 2.139f, 5.85f, 2.929f, 5.4f)
                lineTo(7.259f, 2.92f)
                curveTo(7.989f, 2.5f, 9.099f, 2.47f, 9.849f, 2.85f)
                lineTo(15.099f, 5.48f)
                curveTo(15.399f, 5.63f, 15.979f, 5.61f, 16.279f, 5.45f)
                lineTo(18.629f, 4.11f)
                curveTo(19.649f, 3.53f, 20.699f, 3.45f, 21.489f, 3.92f)
                curveTo(22.289f, 4.38f, 22.739f, 5.32f, 22.739f, 6.5f)
                verticalLineTo(16.23f)
                curveTo(22.739f, 17.14f, 22.139f, 18.17f, 21.349f, 18.62f)
                lineTo(17.019f, 21.1f)
                curveTo(16.639f, 21.3f, 16.139f, 21.41f, 15.649f, 21.41f)
                close()
                moveTo(8.639f, 16.92f)
                curveTo(9.069f, 16.92f, 9.499f, 17.01f, 9.849f, 17.18f)
                lineTo(15.099f, 19.81f)
                curveTo(15.399f, 19.96f, 15.979f, 19.94f, 16.279f, 19.78f)
                lineTo(20.609f, 17.3f)
                curveTo(20.929f, 17.12f, 21.239f, 16.58f, 21.239f, 16.22f)
                verticalLineTo(6.49f)
                curveTo(21.239f, 5.86f, 21.059f, 5.39f, 20.729f, 5.21f)
                curveTo(20.409f, 5.03f, 19.909f, 5.1f, 19.369f, 5.41f)
                lineTo(17.019f, 6.75f)
                curveTo(16.289f, 7.17f, 15.179f, 7.2f, 14.429f, 6.82f)
                lineTo(9.179f, 4.19f)
                curveTo(8.879f, 4.04f, 8.299f, 4.06f, 7.999f, 4.22f)
                lineTo(3.669f, 6.7f)
                curveTo(3.349f, 6.88f, 3.039f, 7.42f, 3.039f, 7.79f)
                verticalLineTo(17.52f)
                curveTo(3.039f, 18.15f, 3.219f, 18.62f, 3.539f, 18.8f)
                curveTo(3.859f, 18.99f, 4.359f, 18.91f, 4.909f, 18.6f)
                lineTo(7.259f, 17.26f)
                curveTo(7.649f, 17.03f, 8.149f, 16.92f, 8.639f, 16.92f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.561f, 17.75f)
                curveTo(8.151f, 17.75f, 7.811f, 17.41f, 7.811f, 17f)
                verticalLineTo(4f)
                curveTo(7.811f, 3.59f, 8.151f, 3.25f, 8.561f, 3.25f)
                curveTo(8.971f, 3.25f, 9.311f, 3.59f, 9.311f, 4f)
                verticalLineTo(17f)
                curveTo(9.311f, 17.41f, 8.971f, 17.75f, 8.561f, 17.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.731f, 20.75f)
                curveTo(15.321f, 20.75f, 14.981f, 20.41f, 14.981f, 20f)
                verticalLineTo(6.62f)
                curveTo(14.981f, 6.21f, 15.321f, 5.87f, 15.731f, 5.87f)
                curveTo(16.14f, 5.87f, 16.48f, 6.21f, 16.48f, 6.62f)
                verticalLineTo(20f)
                curveTo(16.48f, 20.41f, 16.14f, 20.75f, 15.731f, 20.75f)
                close()
            }
        }.build()

        return _Map!!
    }

@Suppress("ObjectPropertyName")
private var _Map: ImageVector? = null
