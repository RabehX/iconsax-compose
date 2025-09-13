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


val Iconsax.Filled.FilterTick: ImageVector
    get() {
        if (_FilterTick != null) {
            return _FilterTick!!
        }
        _FilterTick = ImageVector.Builder(
            name = "Filled.FilterTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.921f, 10.12f)
                curveTo(17.591f, 10.04f, 17.241f, 10f, 16.881f, 10f)
                curveTo(14.261f, 10f, 12.131f, 12.13f, 12.131f, 14.75f)
                curveTo(12.131f, 15.64f, 12.381f, 16.48f, 12.821f, 17.2f)
                curveTo(13.191f, 17.82f, 13.701f, 18.35f, 14.321f, 18.73f)
                curveTo(15.061f, 19.22f, 15.941f, 19.5f, 16.881f, 19.5f)
                curveTo(18.621f, 19.5f, 20.131f, 18.57f, 20.951f, 17.2f)
                curveTo(21.391f, 16.48f, 21.631f, 15.64f, 21.631f, 14.75f)
                curveTo(21.631f, 12.49f, 20.051f, 10.59f, 17.921f, 10.12f)
                close()
                moveTo(19.251f, 14.13f)
                lineTo(16.711f, 16.47f)
                curveTo(16.571f, 16.6f, 16.381f, 16.67f, 16.201f, 16.67f)
                curveTo(16.011f, 16.67f, 15.821f, 16.6f, 15.671f, 16.45f)
                lineTo(14.501f, 15.28f)
                curveTo(14.211f, 14.99f, 14.211f, 14.51f, 14.501f, 14.22f)
                curveTo(14.791f, 13.93f, 15.271f, 13.93f, 15.561f, 14.22f)
                lineTo(16.221f, 14.88f)
                lineTo(18.231f, 13.03f)
                curveTo(18.541f, 12.75f, 19.011f, 12.77f, 19.291f, 13.07f)
                curveTo(19.571f, 13.38f, 19.551f, 13.85f, 19.251f, 14.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.58f, 4.02f)
                verticalLineTo(6.24f)
                curveTo(20.58f, 7.05f, 20.08f, 8.06f, 19.58f, 8.57f)
                lineTo(19.4f, 8.73f)
                curveTo(19.26f, 8.86f, 19.05f, 8.89f, 18.87f, 8.83f)
                curveTo(18.67f, 8.76f, 18.47f, 8.71f, 18.27f, 8.66f)
                curveTo(17.83f, 8.55f, 17.36f, 8.5f, 16.88f, 8.5f)
                curveTo(13.43f, 8.5f, 10.63f, 11.3f, 10.63f, 14.75f)
                curveTo(10.63f, 15.89f, 10.94f, 17.01f, 11.53f, 17.97f)
                curveTo(12.03f, 18.81f, 12.73f, 19.51f, 13.49f, 19.98f)
                curveTo(13.72f, 20.13f, 13.81f, 20.45f, 13.61f, 20.63f)
                curveTo(13.54f, 20.69f, 13.47f, 20.74f, 13.4f, 20.79f)
                lineTo(12f, 21.7f)
                curveTo(10.7f, 22.51f, 8.91f, 21.6f, 8.91f, 19.98f)
                verticalLineTo(14.63f)
                curveTo(8.91f, 13.92f, 8.51f, 13.01f, 8.11f, 12.51f)
                lineTo(4.32f, 8.47f)
                curveTo(3.82f, 7.96f, 3.42f, 7.05f, 3.42f, 6.45f)
                verticalLineTo(4.12f)
                curveTo(3.42f, 2.91f, 4.32f, 2f, 5.41f, 2f)
                horizontalLineTo(18.59f)
                curveTo(19.68f, 2f, 20.58f, 2.91f, 20.58f, 4.02f)
                close()
            }
        }.build()

        return _FilterTick!!
    }

@Suppress("ObjectPropertyName")
private var _FilterTick: ImageVector? = null
