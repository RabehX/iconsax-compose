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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Filled.Profile: ImageVector
    get() {
        if (_profile != null) {
            return _profile!!
        }
        _profile = ImageVector.Builder(
            name = "Filled.Profile",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(12.0f, 2.0f)
                    curveTo(9.38f, 2.0f, 7.25f, 4.13f, 7.25f, 6.75f)
                    curveTo(7.25f, 9.32f, 9.26f, 11.4f, 11.88f, 11.49f)
                    curveTo(11.96f, 11.48f, 12.04f, 11.48f, 12.1f, 11.49f)
                    curveTo(12.12f, 11.49f, 12.13f, 11.49f, 12.15f, 11.49f)
                    curveTo(12.16f, 11.49f, 12.16f, 11.49f, 12.17f, 11.49f)
                    curveTo(14.73f, 11.4f, 16.74f, 9.32f, 16.75f, 6.75f)
                    curveTo(16.75f, 4.13f, 14.62f, 2.0f, 12.0f, 2.0f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000)),
                    stroke = null,
                    strokeLineWidth = 0.0f,
                    strokeLineCap = Butt,
                    strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f,
                    pathFillType = NonZero
                ) {
                    moveTo(17.08f, 14.15f)
                    curveTo(14.29f, 12.29f, 9.74f, 12.29f, 6.93f, 14.15f)
                    curveTo(5.66f, 15.0f, 4.96f, 16.15f, 4.96f, 17.38f)
                    curveTo(4.96f, 18.61f, 5.66f, 19.75f, 6.92f, 20.59f)
                    curveTo(8.32f, 21.53f, 10.16f, 22.0f, 12.0f, 22.0f)
                    curveTo(13.84f, 22.0f, 15.68f, 21.53f, 17.08f, 20.59f)
                    curveTo(18.34f, 19.74f, 19.04f, 18.6f, 19.04f, 17.36f)
                    curveTo(19.03f, 16.13f, 18.34f, 14.99f, 17.08f, 14.15f)
                    close()
                }
            }
        }
        .build()
        return _profile!!
    }

private var _profile: ImageVector? = null
