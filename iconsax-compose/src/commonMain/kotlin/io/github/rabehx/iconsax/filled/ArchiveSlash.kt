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

val Iconsax.Filled.ArchiveSlash: ImageVector
    get() {
        if (_ArchiveSlash != null) {
            return _ArchiveSlash!!
        }
        _ArchiveSlash = ImageVector.Builder(
            name = "Filled.ArchiveSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.12f, 3.88f)
                lineTo(3.39f, 20.61f)
                curveTo(3.34f, 20.41f, 3.32f, 20.19f, 3.32f, 19.95f)
                verticalLineTo(5.86f)
                curveTo(3.32f, 3.74f, 5.05f, 2f, 7.18f, 2f)
                horizontalLineTo(16.82f)
                curveTo(18.22f, 2f, 19.45f, 2.75f, 20.12f, 3.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.771f, 2.229f)
                curveTo(21.471f, 1.929f, 20.981f, 1.929f, 20.681f, 2.229f)
                lineTo(2.231f, 20.689f)
                curveTo(1.931f, 20.989f, 1.931f, 21.479f, 2.231f, 21.779f)
                curveTo(2.381f, 21.919f, 2.571f, 21.999f, 2.771f, 21.999f)
                curveTo(2.971f, 21.999f, 3.161f, 21.919f, 3.311f, 21.769f)
                lineTo(21.771f, 3.309f)
                curveTo(22.081f, 3.009f, 22.081f, 2.529f, 21.771f, 2.229f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.29f, 7.711f)
                lineTo(11.9f, 15.101f)
                curveTo(11.44f, 15.561f, 11.53f, 16.33f, 12.09f, 16.66f)
                lineTo(19.48f, 21.09f)
                curveTo(20.15f, 21.49f, 20.99f, 21.01f, 20.99f, 20.23f)
                verticalLineTo(8.411f)
                curveTo(21f, 7.521f, 19.92f, 7.081f, 19.29f, 7.711f)
                close()
            }
        }.build()

        return _ArchiveSlash!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveSlash: ImageVector? = null
