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

val Iconsax.Outline.RecordCircle: ImageVector
    get() {
        if (_RecordCircle != null) {
            return _RecordCircle!!
        }
        _RecordCircle = ImageVector.Builder(
            name = "Outline.RecordCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11.971f, 22.75f)
                curveTo(6.051f, 22.75f, 1.221f, 17.93f, 1.221f, 12f)
                curveTo(1.221f, 6.07f, 6.051f, 1.25f, 11.971f, 1.25f)
                curveTo(17.891f, 1.25f, 22.721f, 6.07f, 22.721f, 12f)
                curveTo(22.721f, 17.93f, 17.901f, 22.75f, 11.971f, 22.75f)
                close()
                moveTo(11.971f, 2.75f)
                curveTo(6.871f, 2.75f, 2.721f, 6.9f, 2.721f, 12f)
                curveTo(2.721f, 17.1f, 6.871f, 21.25f, 11.971f, 21.25f)
                curveTo(17.071f, 21.25f, 21.221f, 17.1f, 21.221f, 12f)
                curveTo(21.221f, 6.9f, 17.071f, 2.75f, 11.971f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.98f)
                curveTo(9.25f, 16.98f, 7.02f, 14.75f, 7.02f, 12f)
                curveTo(7.02f, 9.25f, 9.25f, 7.02f, 12f, 7.02f)
                curveTo(14.75f, 7.02f, 16.979f, 9.25f, 16.979f, 12f)
                curveTo(16.979f, 14.75f, 14.75f, 16.98f, 12f, 16.98f)
                close()
                moveTo(12f, 8.52f)
                curveTo(10.08f, 8.52f, 8.52f, 10.08f, 8.52f, 12f)
                curveTo(8.52f, 13.92f, 10.08f, 15.48f, 12f, 15.48f)
                curveTo(13.92f, 15.48f, 15.479f, 13.92f, 15.479f, 12f)
                curveTo(15.479f, 10.08f, 13.92f, 8.52f, 12f, 8.52f)
                close()
            }
        }.build()

        return _RecordCircle!!
    }

@Suppress("ObjectPropertyName")
private var _RecordCircle: ImageVector? = null
