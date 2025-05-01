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

val Iconsax.Outline.StopCircle: ImageVector
    get() {
        if (_StopCircle != null) {
            return _StopCircle!!
        }
        _StopCircle = ImageVector.Builder(
            name = "Outline.StopCircle",
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
                moveTo(13.269f, 16.98f)
                horizontalLineTo(10.729f)
                curveTo(8.2f, 16.98f, 7.02f, 15.8f, 7.02f, 13.27f)
                verticalLineTo(10.73f)
                curveTo(7.02f, 8.2f, 8.2f, 7.02f, 10.729f, 7.02f)
                horizontalLineTo(13.269f)
                curveTo(15.8f, 7.02f, 16.979f, 8.2f, 16.979f, 10.73f)
                verticalLineTo(13.27f)
                curveTo(16.979f, 15.8f, 15.8f, 16.98f, 13.269f, 16.98f)
                close()
                moveTo(10.729f, 8.52f)
                curveTo(9.04f, 8.52f, 8.52f, 9.04f, 8.52f, 10.73f)
                verticalLineTo(13.27f)
                curveTo(8.52f, 14.96f, 9.04f, 15.48f, 10.729f, 15.48f)
                horizontalLineTo(13.269f)
                curveTo(14.96f, 15.48f, 15.479f, 14.96f, 15.479f, 13.27f)
                verticalLineTo(10.73f)
                curveTo(15.479f, 9.04f, 14.96f, 8.52f, 13.269f, 8.52f)
                horizontalLineTo(10.729f)
                close()
            }
        }.build()

        return _StopCircle!!
    }

@Suppress("ObjectPropertyName")
private var _StopCircle: ImageVector? = null
