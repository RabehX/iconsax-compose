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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.Note21: ImageVector
    get() {
        if (_Note21 != null) {
            return _Note21!!
        }
        _Note21 = ImageVector.Builder(
            name = "Filled.Note21",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.676f, 19.959f)
                curveTo(12.951f, 20.023f, 12.976f, 20.383f, 12.708f, 20.472f)
                lineTo(11.128f, 20.992f)
                curveTo(7.158f, 22.272f, 5.068f, 21.202f, 3.778f, 17.232f)
                lineTo(2.498f, 13.282f)
                curveTo(1.218f, 9.312f, 2.278f, 7.212f, 6.248f, 5.932f)
                lineTo(6.772f, 5.758f)
                curveTo(7.175f, 5.625f, 7.567f, 6.029f, 7.453f, 6.438f)
                curveTo(7.396f, 6.64f, 7.342f, 6.852f, 7.288f, 7.072f)
                lineTo(6.308f, 11.262f)
                curveTo(5.208f, 15.972f, 6.818f, 18.572f, 11.528f, 19.692f)
                lineTo(12.676f, 19.959f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.17f, 3.209f)
                lineTo(15.5f, 2.819f)
                curveTo(12.16f, 2.029f, 10.17f, 2.679f, 9f, 5.099f)
                curveTo(8.7f, 5.709f, 8.46f, 6.449f, 8.26f, 7.299f)
                lineTo(7.28f, 11.488f)
                curveTo(6.3f, 15.668f, 7.59f, 17.729f, 11.76f, 18.719f)
                lineTo(13.44f, 19.118f)
                curveTo(14.02f, 19.258f, 14.56f, 19.348f, 15.06f, 19.389f)
                curveTo(18.18f, 19.688f, 19.84f, 18.229f, 20.68f, 14.618f)
                lineTo(21.66f, 10.439f)
                curveTo(22.64f, 6.259f, 21.36f, 4.189f, 17.17f, 3.209f)
                close()
                moveTo(15.29f, 13.328f)
                curveTo(15.2f, 13.668f, 14.9f, 13.889f, 14.56f, 13.889f)
                curveTo(14.5f, 13.889f, 14.44f, 13.878f, 14.37f, 13.868f)
                lineTo(11.46f, 13.128f)
                curveTo(11.06f, 13.028f, 10.82f, 12.618f, 10.92f, 12.219f)
                curveTo(11.02f, 11.818f, 11.43f, 11.578f, 11.83f, 11.679f)
                lineTo(14.74f, 12.418f)
                curveTo(15.15f, 12.519f, 15.39f, 12.929f, 15.29f, 13.328f)
                close()
                moveTo(18.22f, 9.949f)
                curveTo(18.13f, 10.288f, 17.83f, 10.509f, 17.49f, 10.509f)
                curveTo(17.43f, 10.509f, 17.37f, 10.498f, 17.3f, 10.488f)
                lineTo(12.45f, 9.259f)
                curveTo(12.05f, 9.159f, 11.81f, 8.749f, 11.91f, 8.349f)
                curveTo(12.01f, 7.949f, 12.42f, 7.709f, 12.82f, 7.809f)
                lineTo(17.67f, 9.039f)
                curveTo(18.08f, 9.129f, 18.32f, 9.539f, 18.22f, 9.949f)
                close()
            }
        }.build()

        return _Note21!!
    }

@Suppress("ObjectPropertyName")
private var _Note21: ImageVector? = null
