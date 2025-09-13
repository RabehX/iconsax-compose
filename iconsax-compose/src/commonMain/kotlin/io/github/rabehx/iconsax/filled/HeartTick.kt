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


val Iconsax.Filled.HeartTick: ImageVector
    get() {
        if (_HeartTick != null) {
            return _HeartTick!!
        }
        _HeartTick = ImageVector.Builder(
            name = "Filled.HeartTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.2f, 12.398f)
                curveTo(14.55f, 12.398f, 12.4f, 14.548f, 12.4f, 17.198f)
                curveTo(12.4f, 18.098f, 12.65f, 18.948f, 13.1f, 19.668f)
                curveTo(13.93f, 21.058f, 15.45f, 21.998f, 17.2f, 21.998f)
                curveTo(18.95f, 21.998f, 20.48f, 21.058f, 21.3f, 19.668f)
                curveTo(21.74f, 18.948f, 22f, 18.098f, 22f, 17.198f)
                curveTo(22f, 14.548f, 19.85f, 12.398f, 17.2f, 12.398f)
                close()
                moveTo(19.58f, 16.568f)
                lineTo(17.02f, 18.928f)
                curveTo(16.88f, 19.058f, 16.69f, 19.128f, 16.51f, 19.128f)
                curveTo(16.32f, 19.128f, 16.13f, 19.058f, 15.98f, 18.908f)
                lineTo(14.8f, 17.728f)
                curveTo(14.51f, 17.438f, 14.51f, 16.958f, 14.8f, 16.668f)
                curveTo(15.09f, 16.378f, 15.57f, 16.378f, 15.86f, 16.668f)
                lineTo(16.53f, 17.338f)
                lineTo(18.56f, 15.458f)
                curveTo(18.86f, 15.178f, 19.34f, 15.198f, 19.62f, 15.498f)
                curveTo(19.9f, 15.808f, 19.88f, 16.288f, 19.58f, 16.568f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 8.731f)
                curveTo(22f, 9.921f, 21.81f, 11.021f, 21.48f, 12.041f)
                curveTo(21.42f, 12.251f, 21.17f, 12.311f, 20.99f, 12.181f)
                curveTo(19.9f, 11.371f, 18.57f, 10.941f, 17.2f, 10.941f)
                curveTo(13.73f, 10.941f, 10.9f, 13.771f, 10.9f, 17.241f)
                curveTo(10.9f, 18.321f, 11.18f, 19.381f, 11.71f, 20.321f)
                curveTo(11.87f, 20.601f, 11.68f, 20.961f, 11.38f, 20.851f)
                curveTo(8.97f, 20.031f, 4.1f, 17.041f, 2.52f, 12.041f)
                curveTo(2.19f, 11.021f, 2f, 9.921f, 2f, 8.731f)
                curveTo(2f, 5.641f, 4.49f, 3.141f, 7.56f, 3.141f)
                curveTo(9.37f, 3.141f, 10.99f, 4.021f, 12f, 5.371f)
                curveTo(13.01f, 4.021f, 14.63f, 3.141f, 16.44f, 3.141f)
                curveTo(19.51f, 3.141f, 22f, 5.641f, 22f, 8.731f)
                close()
            }
        }.build()

        return _HeartTick!!
    }

@Suppress("ObjectPropertyName")
private var _HeartTick: ImageVector? = null
