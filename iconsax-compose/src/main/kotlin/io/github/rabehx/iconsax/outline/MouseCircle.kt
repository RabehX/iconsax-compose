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

val Iconsax.Outline.MouseCircle: ImageVector
    get() {
        if (_MouseCircle != null) {
            return _MouseCircle!!
        }
        _MouseCircle = ImageVector.Builder(
            name = "Outline.MouseCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.369f, 22.77f)
                curveTo(16.359f, 22.77f, 16.359f, 22.77f, 16.349f, 22.77f)
                curveTo(15.339f, 22.76f, 14.499f, 22.14f, 14.199f, 21.17f)
                lineTo(12.349f, 15.22f)
                curveTo(12.099f, 14.4f, 12.309f, 13.52f, 12.919f, 12.93f)
                curveTo(13.519f, 12.34f, 14.389f, 12.12f, 15.189f, 12.37f)
                lineTo(21.149f, 14.22f)
                curveTo(22.109f, 14.52f, 22.739f, 15.36f, 22.749f, 16.37f)
                curveTo(22.759f, 17.37f, 22.149f, 18.22f, 21.189f, 18.54f)
                lineTo(19.559f, 19.09f)
                curveTo(19.329f, 19.17f, 19.149f, 19.34f, 19.079f, 19.57f)
                lineTo(18.519f, 21.21f)
                curveTo(18.209f, 22.16f, 17.369f, 22.77f, 16.369f, 22.77f)
                close()
                moveTo(14.509f, 13.77f)
                curveTo(14.239f, 13.77f, 14.059f, 13.92f, 13.979f, 13.99f)
                curveTo(13.769f, 14.2f, 13.699f, 14.49f, 13.789f, 14.78f)
                lineTo(15.639f, 20.73f)
                curveTo(15.799f, 21.24f, 16.239f, 21.26f, 16.379f, 21.27f)
                curveTo(16.519f, 21.27f, 16.949f, 21.23f, 17.109f, 20.74f)
                lineTo(17.669f, 19.1f)
                curveTo(17.889f, 18.43f, 18.429f, 17.9f, 19.099f, 17.67f)
                lineTo(20.729f, 17.12f)
                curveTo(21.229f, 16.96f, 21.259f, 16.52f, 21.259f, 16.39f)
                curveTo(21.259f, 16.26f, 21.219f, 15.82f, 20.719f, 15.66f)
                lineTo(14.759f, 13.81f)
                curveTo(14.659f, 13.78f, 14.579f, 13.77f, 14.509f, 13.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 12.41f, 22.41f, 12.75f, 22f, 12.75f)
                curveTo(21.59f, 12.75f, 21.25f, 12.41f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(12.41f, 21.25f, 12.75f, 21.59f, 12.75f, 22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
        }.build()

        return _MouseCircle!!
    }

@Suppress("ObjectPropertyName")
private var _MouseCircle: ImageVector? = null
