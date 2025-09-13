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


val Iconsax.Filled.MagicStar: ImageVector
    get() {
        if (_MagicStar != null) {
            return _MagicStar!!
        }
        _MagicStar = ImageVector.Builder(
            name = "Filled.MagicStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.29f, 4.14f)
                lineTo(17.22f, 7.93f)
                curveTo(17.21f, 8.45f, 17.54f, 9.14f, 17.96f, 9.45f)
                lineTo(20.44f, 11.33f)
                curveTo(22.03f, 12.53f, 21.77f, 14f, 19.87f, 14.6f)
                lineTo(16.64f, 15.61f)
                curveTo(16.1f, 15.78f, 15.53f, 16.37f, 15.39f, 16.92f)
                lineTo(14.62f, 19.86f)
                curveTo(14.01f, 22.18f, 12.49f, 22.41f, 11.23f, 20.37f)
                lineTo(9.47f, 17.52f)
                curveTo(9.15f, 17f, 8.39f, 16.61f, 7.79f, 16.64f)
                lineTo(4.45f, 16.81f)
                curveTo(2.06f, 16.93f, 1.38f, 15.55f, 2.94f, 13.73f)
                lineTo(4.92f, 11.43f)
                curveTo(5.29f, 11f, 5.46f, 10.2f, 5.29f, 9.66f)
                lineTo(4.27f, 6.42f)
                curveTo(3.68f, 4.52f, 4.74f, 3.47f, 6.63f, 4.09f)
                lineTo(9.58f, 5.06f)
                curveTo(10.08f, 5.22f, 10.83f, 5.11f, 11.25f, 4.8f)
                lineTo(14.33f, 2.58f)
                curveTo(16f, 1.39f, 17.33f, 2.09f, 17.29f, 4.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.44f, 20.47f)
                lineTo(18.41f, 17.44f)
                curveTo(18.12f, 17.15f, 17.64f, 17.15f, 17.35f, 17.44f)
                curveTo(17.06f, 17.73f, 17.06f, 18.21f, 17.35f, 18.5f)
                lineTo(20.38f, 21.53f)
                curveTo(20.53f, 21.68f, 20.72f, 21.75f, 20.91f, 21.75f)
                curveTo(21.1f, 21.75f, 21.29f, 21.68f, 21.44f, 21.53f)
                curveTo(21.73f, 21.24f, 21.73f, 20.76f, 21.44f, 20.47f)
                close()
            }
        }.build()

        return _MagicStar!!
    }

@Suppress("ObjectPropertyName")
private var _MagicStar: ImageVector? = null
