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

val Iconsax.Outline.Chart3: ImageVector
    get() {
        if (_Chart3 != null) {
            return _Chart3!!
        }
        _Chart3 = ImageVector.Builder(
            name = "Outline.Chart3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 9.64f, 2f, 7.4f, 3.42f, 5.52f)
                curveTo(3.67f, 5.19f, 4.14f, 5.13f, 4.47f, 5.38f)
                curveTo(4.8f, 5.63f, 4.87f, 6.1f, 4.62f, 6.43f)
                curveTo(3.4f, 8.04f, 2.75f, 9.97f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(17.1f, 21.25f, 21.25f, 17.1f, 21.25f, 12f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                curveTo(11.59f, 2.75f, 11.25f, 2.41f, 11.25f, 2f)
                curveTo(11.25f, 1.59f, 11.59f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 17.93f, 17.93f, 22.75f, 12f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 19.75f)
                curveTo(7.73f, 19.75f, 4.25f, 16.27f, 4.25f, 12f)
                curveTo(4.25f, 11.59f, 4.59f, 11.25f, 5f, 11.25f)
                curveTo(5.41f, 11.25f, 5.75f, 11.59f, 5.75f, 12f)
                curveTo(5.75f, 15.45f, 8.55f, 18.25f, 12f, 18.25f)
                curveTo(15.45f, 18.25f, 18.25f, 15.45f, 18.25f, 12f)
                curveTo(18.25f, 8.55f, 15.45f, 5.75f, 12f, 5.75f)
                curveTo(11.59f, 5.75f, 11.25f, 5.41f, 11.25f, 5f)
                curveTo(11.25f, 4.59f, 11.59f, 4.25f, 12f, 4.25f)
                curveTo(16.27f, 4.25f, 19.75f, 7.73f, 19.75f, 12f)
                curveTo(19.75f, 16.27f, 16.27f, 19.75f, 12f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.75f)
                curveTo(11.59f, 16.75f, 11.25f, 16.41f, 11.25f, 16f)
                curveTo(11.25f, 15.59f, 11.59f, 15.25f, 12f, 15.25f)
                curveTo(13.79f, 15.25f, 15.25f, 13.79f, 15.25f, 12f)
                curveTo(15.25f, 10.21f, 13.79f, 8.75f, 12f, 8.75f)
                curveTo(11.59f, 8.75f, 11.25f, 8.41f, 11.25f, 8f)
                curveTo(11.25f, 7.59f, 11.59f, 7.25f, 12f, 7.25f)
                curveTo(14.62f, 7.25f, 16.75f, 9.38f, 16.75f, 12f)
                curveTo(16.75f, 14.62f, 14.62f, 16.75f, 12f, 16.75f)
                close()
            }
        }.build()

        return _Chart3!!
    }

@Suppress("ObjectPropertyName")
private var _Chart3: ImageVector? = null
