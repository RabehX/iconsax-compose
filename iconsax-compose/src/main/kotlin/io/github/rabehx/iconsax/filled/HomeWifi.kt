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


val Iconsax.Filled.HomeWifi: ImageVector
    get() {
        if (_HomeWifi != null) {
            return _HomeWifi!!
        }
        _HomeWifi = ImageVector.Builder(
            name = "Filled.HomeWifi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.859f, 8.37f)
                lineTo(13.929f, 2.83f)
                curveTo(12.859f, 1.97f, 11.129f, 1.97f, 10.069f, 2.82f)
                lineTo(3.139f, 8.37f)
                curveTo(2.359f, 8.99f, 1.859f, 10.3f, 2.029f, 11.28f)
                lineTo(3.359f, 19.24f)
                curveTo(3.599f, 20.66f, 4.959f, 21.81f, 6.399f, 21.81f)
                horizontalLineTo(17.599f)
                curveTo(19.029f, 21.81f, 20.399f, 20.65f, 20.639f, 19.24f)
                lineTo(21.969f, 11.28f)
                curveTo(22.129f, 10.3f, 21.629f, 8.99f, 20.859f, 8.37f)
                close()
                moveTo(12.709f, 17.2f)
                curveTo(12.509f, 17.4f, 12.259f, 17.5f, 11.999f, 17.5f)
                curveTo(11.739f, 17.5f, 11.489f, 17.4f, 11.289f, 17.21f)
                curveTo(10.899f, 16.82f, 10.899f, 16.19f, 11.289f, 15.8f)
                curveTo(11.679f, 15.41f, 12.319f, 15.41f, 12.709f, 15.8f)
                curveTo(13.099f, 16.18f, 13.099f, 16.81f, 12.709f, 17.2f)
                close()
                moveTo(14.659f, 14.9f)
                curveTo(14.509f, 15.05f, 14.319f, 15.13f, 14.119f, 15.13f)
                curveTo(13.929f, 15.13f, 13.749f, 15.06f, 13.599f, 14.92f)
                curveTo(12.629f, 13.99f, 11.369f, 13.99f, 10.389f, 14.92f)
                curveTo(10.089f, 15.21f, 9.619f, 15.2f, 9.329f, 14.9f)
                curveTo(9.039f, 14.6f, 9.049f, 14.13f, 9.349f, 13.84f)
                curveTo(10.899f, 12.35f, 13.069f, 12.35f, 14.629f, 13.84f)
                curveTo(14.939f, 14.12f, 14.949f, 14.6f, 14.659f, 14.9f)
                close()
                moveTo(16.779f, 12.78f)
                curveTo(16.629f, 12.93f, 16.439f, 13.01f, 16.239f, 13.01f)
                curveTo(16.049f, 13.01f, 15.859f, 12.94f, 15.719f, 12.8f)
                curveTo(15.249f, 12.34f, 14.719f, 11.97f, 14.159f, 11.7f)
                curveTo(12.759f, 11.03f, 11.229f, 11.03f, 9.839f, 11.7f)
                curveTo(9.279f, 11.97f, 8.759f, 12.34f, 8.279f, 12.8f)
                curveTo(7.989f, 13.09f, 7.509f, 13.09f, 7.219f, 12.79f)
                curveTo(6.929f, 12.49f, 6.939f, 12.02f, 7.229f, 11.73f)
                curveTo(7.819f, 11.15f, 8.479f, 10.69f, 9.189f, 10.35f)
                curveTo(10.999f, 9.48f, 12.999f, 9.48f, 14.799f, 10.35f)
                curveTo(15.509f, 10.69f, 16.169f, 11.15f, 16.759f, 11.73f)
                curveTo(17.059f, 12.01f, 17.069f, 12.49f, 16.779f, 12.78f)
                close()
            }
        }.build()

        return _HomeWifi!!
    }

@Suppress("ObjectPropertyName")
private var _HomeWifi: ImageVector? = null
