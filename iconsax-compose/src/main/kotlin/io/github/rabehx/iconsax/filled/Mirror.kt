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


val Iconsax.Filled.Mirror: ImageVector
    get() {
        if (_Mirror != null) {
            return _Mirror!!
        }
        _Mirror = ImageVector.Builder(
            name = "Filled.Mirror",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18f)
                curveTo(16.418f, 18f, 20f, 14.418f, 20f, 10f)
                curveTo(20f, 5.582f, 16.418f, 2f, 12f, 2f)
                curveTo(7.582f, 2f, 4f, 5.582f, 4f, 10f)
                curveTo(4f, 14.418f, 7.582f, 18f, 12f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 22.75f)
                horizontalLineTo(6f)
                curveTo(5.59f, 22.75f, 5.25f, 22.41f, 5.25f, 22f)
                curveTo(5.25f, 21.59f, 5.59f, 21.25f, 6f, 21.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 21.25f, 18.75f, 21.59f, 18.75f, 22f)
                curveTo(18.75f, 22.41f, 18.41f, 22.75f, 18f, 22.75f)
                close()
            }
        }.build()

        return _Mirror!!
    }

@Suppress("ObjectPropertyName")
private var _Mirror: ImageVector? = null
