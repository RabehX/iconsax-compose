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


val Iconsax.Filled.CloudRemove: ImageVector
    get() {
        if (_CloudRemove != null) {
            return _CloudRemove!!
        }
        _CloudRemove = ImageVector.Builder(
            name = "Filled.CloudRemove",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 11.531f)
                curveTo(9.24f, 11.531f, 7f, 13.771f, 7f, 16.531f)
                curveTo(7f, 17.271f, 7.16f, 17.971f, 7.46f, 18.591f)
                curveTo(7.54f, 18.771f, 7.63f, 18.941f, 7.73f, 19.101f)
                curveTo(8.59f, 20.551f, 10.18f, 21.531f, 12f, 21.531f)
                curveTo(13.82f, 21.531f, 15.41f, 20.551f, 16.27f, 19.101f)
                curveTo(16.37f, 18.941f, 16.46f, 18.771f, 16.54f, 18.591f)
                curveTo(16.84f, 17.971f, 17f, 17.271f, 17f, 16.531f)
                curveTo(17f, 13.771f, 14.76f, 11.531f, 12f, 11.531f)
                close()
                moveTo(13.5f, 18.141f)
                curveTo(13.35f, 18.291f, 13.16f, 18.361f, 12.97f, 18.361f)
                curveTo(12.78f, 18.361f, 12.59f, 18.291f, 12.44f, 18.141f)
                lineTo(11.91f, 17.611f)
                lineTo(11.36f, 18.161f)
                curveTo(11.21f, 18.311f, 11.02f, 18.381f, 10.83f, 18.381f)
                curveTo(10.64f, 18.381f, 10.45f, 18.311f, 10.3f, 18.161f)
                curveTo(10.01f, 17.871f, 10.01f, 17.391f, 10.3f, 17.101f)
                lineTo(10.85f, 16.551f)
                lineTo(10.32f, 16.021f)
                curveTo(10.03f, 15.731f, 10.03f, 15.251f, 10.32f, 14.961f)
                curveTo(10.61f, 14.671f, 11.09f, 14.671f, 11.38f, 14.961f)
                lineTo(11.91f, 15.491f)
                lineTo(12.41f, 14.991f)
                curveTo(12.7f, 14.701f, 13.18f, 14.701f, 13.47f, 14.991f)
                curveTo(13.76f, 15.281f, 13.76f, 15.761f, 13.47f, 16.051f)
                lineTo(12.97f, 16.551f)
                lineTo(13.5f, 17.081f)
                curveTo(13.79f, 17.381f, 13.79f, 17.851f, 13.5f, 18.141f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.199f, 17.291f)
                curveTo(19.839f, 17.611f, 19.449f, 17.881f, 19.029f, 18.101f)
                curveTo(18.669f, 18.281f, 18.309f, 17.931f, 18.369f, 17.531f)
                curveTo(18.409f, 17.241f, 18.429f, 16.941f, 18.429f, 16.631f)
                curveTo(18.429f, 13.051f, 15.509f, 10.131f, 11.929f, 10.131f)
                curveTo(8.349f, 10.131f, 5.429f, 13.051f, 5.429f, 16.631f)
                curveTo(5.429f, 17.091f, 5.479f, 17.531f, 5.569f, 17.961f)
                curveTo(5.639f, 18.311f, 5.369f, 18.661f, 5.019f, 18.571f)
                curveTo(1.069f, 17.611f, 1.049f, 11.531f, 5.469f, 11.211f)
                horizontalLineTo(5.519f)
                curveTo(2.309f, 2.291f, 15.849f, -1.279f, 17.399f, 8.101f)
                curveTo(21.729f, 8.651f, 23.479f, 14.421f, 20.199f, 17.291f)
                close()
            }
        }.build()

        return _CloudRemove!!
    }

@Suppress("ObjectPropertyName")
private var _CloudRemove: ImageVector? = null
