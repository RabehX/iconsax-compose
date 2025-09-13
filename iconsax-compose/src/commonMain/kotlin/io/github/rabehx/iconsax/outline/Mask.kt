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

val Iconsax.Outline.Mask: ImageVector
    get() {
        if (_Mask != null) {
            return _Mask!!
        }
        _Mask = ImageVector.Builder(
            name = "Outline.Mask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.999f, 22.72f)
                curveTo(6.089f, 22.72f, 1.279f, 17.91f, 1.279f, 12f)
                curveTo(1.279f, 6.09f, 6.089f, 1.28f, 11.999f, 1.28f)
                curveTo(14.649f, 1.28f, 17.189f, 2.26f, 19.149f, 4.03f)
                curveTo(21.419f, 6.04f, 22.719f, 8.95f, 22.719f, 12f)
                curveTo(22.719f, 15.05f, 21.419f, 17.96f, 19.139f, 19.98f)
                curveTo(17.189f, 21.75f, 14.649f, 22.72f, 11.999f, 22.72f)
                close()
                moveTo(11.999f, 2.78f)
                curveTo(6.909f, 2.78f, 2.779f, 6.92f, 2.779f, 12f)
                curveTo(2.779f, 17.08f, 6.919f, 21.22f, 11.999f, 21.22f)
                curveTo(14.279f, 21.22f, 16.459f, 20.38f, 18.149f, 18.85f)
                curveTo(20.109f, 17.11f, 21.229f, 14.62f, 21.229f, 11.99f)
                curveTo(21.229f, 9.36f, 20.109f, 6.87f, 18.159f, 5.14f)
                curveTo(16.459f, 3.62f, 14.279f, 2.78f, 11.999f, 2.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.439f, 18.91f)
                curveTo(10.069f, 18.91f, 9.679f, 18.83f, 9.299f, 18.68f)
                curveTo(6.559f, 17.58f, 4.779f, 14.95f, 4.779f, 12f)
                curveTo(4.779f, 9.05f, 6.549f, 6.42f, 9.299f, 5.32f)
                curveTo(10.169f, 4.97f, 11.049f, 5.02f, 11.709f, 5.46f)
                curveTo(12.349f, 5.89f, 12.709f, 6.65f, 12.729f, 7.6f)
                verticalLineTo(16.39f)
                verticalLineTo(16.4f)
                curveTo(12.719f, 17.35f, 12.359f, 18.12f, 11.709f, 18.54f)
                curveTo(11.339f, 18.79f, 10.899f, 18.91f, 10.439f, 18.91f)
                close()
                moveTo(10.439f, 6.59f)
                curveTo(10.259f, 6.59f, 10.059f, 6.63f, 9.859f, 6.71f)
                curveTo(7.679f, 7.58f, 6.279f, 9.66f, 6.279f, 12f)
                curveTo(6.279f, 14.34f, 7.679f, 16.42f, 9.859f, 17.29f)
                curveTo(10.259f, 17.45f, 10.639f, 17.45f, 10.879f, 17.3f)
                curveTo(11.159f, 17.11f, 11.219f, 16.7f, 11.229f, 16.39f)
                verticalLineTo(7.61f)
                curveTo(11.229f, 7.31f, 11.159f, 6.89f, 10.879f, 6.7f)
                curveTo(10.759f, 6.63f, 10.609f, 6.59f, 10.439f, 6.59f)
                close()
            }
        }.build()

        return _Mask!!
    }

@Suppress("ObjectPropertyName")
private var _Mask: ImageVector? = null
