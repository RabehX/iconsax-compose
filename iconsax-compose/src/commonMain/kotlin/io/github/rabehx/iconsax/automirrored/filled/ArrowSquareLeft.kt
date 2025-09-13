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

package io.github.rabehx.iconsax.automirrored.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.AutoMirrored.Filled.ArrowSquareLeft: ImageVector
    get() {
        if (_ArrowSquareLeft != null) {
            return _ArrowSquareLeft!!
        }
        _ArrowSquareLeft = ImageVector.Builder(
            name = "ArrowSquareLeft",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
            autoMirror = true
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.19f, 2f)
                lineTo(7.81f, 2f)
                curveTo(4.17f, 2f, 2f, 4.17f, 2f, 7.81f)
                verticalLineToRelative(8.37f)
                curveTo(2f, 19.83f, 4.17f, 22f, 7.81f, 22f)
                horizontalLineToRelative(8.37f)
                curveToRelative(3.64f, 0f, 5.81f, -2.17f, 5.81f, -5.81f)
                lineTo(21.99f, 7.81f)
                curveTo(22f, 4.17f, 19.83f, 2f, 16.19f, 2f)
                close()
                moveTo(13.79f, 15f)
                curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0f, 1.06f)
                curveToRelative(-0.15f, 0.15f, -0.34f, 0.22f, -0.53f, 0.22f)
                reflectiveCurveToRelative(-0.38f, -0.07f, -0.53f, -0.22f)
                lineTo(9.2f, 12.53f)
                arcToRelative(0.754f, 0.754f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -1.06f)
                lineToRelative(3.53f, -3.53f)
                curveToRelative(0.29f, -0.29f, 0.77f, -0.29f, 1.06f, 0f)
                curveToRelative(0.29f, 0.29f, 0.29f, 0.77f, 0f, 1.06f)
                lineToRelative(-3f, 3f)
                lineToRelative(3f, 3f)
                close()
            }
        }.build()

        return _ArrowSquareLeft!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowSquareLeft: ImageVector? = null
